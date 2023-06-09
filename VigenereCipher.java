public class VigenereCipher {
    public static void main(String[] args) {
        System.out.print("Masukkan teks asli: ");
        String plaintext = System.console().readLine();
        System.out.print("Masukkan kunci: ");
        String key = System.console().readLine();
        String ciphertext = encrypt(plaintext, key);
        System.out.println("Teks Asli: " + plaintext);
        System.out.println("Kunci: " + key);
        System.out.println("Teks Terenkripsi: " + ciphertext);
    }

    public static String encrypt(String plaintext, String key) {
        String ciphertext = "";
        plaintext = plaintext.toLowerCase();
        key = key.toLowerCase();
        int j = 0;
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int shift = key.charAt(j) - 'a';
                ch = (char) (((ch - 'a' + shift) % 26) + 'a');
                j = (j + 1) % key.length();
            }
            ciphertext += ch;
        }
        return ciphertext;
    }
}
