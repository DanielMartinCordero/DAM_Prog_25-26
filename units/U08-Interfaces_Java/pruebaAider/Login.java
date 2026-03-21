package pruebaAider;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mindrot.jbcrypt.BCrypt; // Requiere la dependencia de jBCrypt

public class Login {
    // Mapa para almacenar usuarios en memoria (email -> User)
    private final Map<String, User> users;

    // Patrón para validar direcciones de correo electrónico
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"
    );

    public Login() {
        this.users = new HashMap<>();
    }

    /**
     * Registra un nuevo usuario con un correo electrónico y una contraseña.
     * La contraseña se hashifica antes de ser almacenada.
     *
     * @param email El correo electrónico del usuario.
     * @param password La contraseña en texto plano del usuario.
     * @return true si el usuario se registró exitosamente, false si el correo ya existe o es inválido.
     */
    public boolean registerUser(String email, String password) {
        if (!isValidEmail(email)) {
            System.out.println("Error: Formato de correo electrónico inválido.");
            return false;
        }
        if (users.containsKey(email)) {
            System.out.println("Error: El correo electrónico ya está registrado.");
            return false;
        }
        if (password == null || password.length() < 8) { // Mínimo 8 caracteres para la contraseña
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
            return false;
        }

        // Hash de la contraseña usando BCrypt
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        users.put(email, new User(email, hashedPassword));
        System.out.println("Usuario " + email + " registrado exitosamente.");
        return true;
    }

    /**
     * Autentica un usuario con su correo electrónico y contraseña.
     *
     * @param email El correo electrónico del usuario.
     * @param password La contraseña en texto plano del usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    public boolean authenticateUser(String email, String password) {
        if (!users.containsKey(email)) {
            System.out.println("Error: Usuario no encontrado.");
            return false;
        }

        User user = users.get(email);
        // Verificar la contraseña usando BCrypt
        if (BCrypt.checkpw(password, user.getHashedPassword())) {
            System.out.println("Autenticación exitosa para " + email + ".");
            return true;
        } else {
            System.out.println("Error: Contraseña incorrecta.");
            return false;
        }
    }

    /**
     * Valida el formato de una dirección de correo electrónico.
     * @param email La dirección de correo a validar.
     * @return true si el formato es válido, false en caso contrario.
     */
    private boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
