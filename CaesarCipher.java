public class CaesarCipher {
    public static void main(String[] args) {
        System.out.print("Masukkan teks asli: ");
        String plaintext = System.console().readLine();
        System.out.print("Masukkan kunci pergeseran: ");
        int shift = Integer.parseInt(System.console().readLine());
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Teks terenkripsi: " + ciphertext);
    }

    public static String encrypt(String plaintext, int shift) {
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) (((ch - 'a' + shift) % 26) + 'a');
            }
            ciphertext += ch;
        }
        return ciphertext;
    }
}
