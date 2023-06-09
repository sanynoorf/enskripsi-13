public class SubstitutionCipher {
    public static void main(String[] args) {
        System.out.print("Masukkan teks asli: ");
        String plaintext = System.console().readLine();
        String ciphertext = encrypt(plaintext);
        System.out.println("Teks Asli: " + plaintext);
        System.out.println("Teks Terenkripsi: " + ciphertext);
    }

    public static String encrypt(String plaintext) {
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (ch == 'A') {
                ciphertext += 'S';
            } else if (ch == 'B') {
                ciphertext += 'T';
            } else if (ch == 'E') {
                ciphertext += 'V';
            } else if (ch == 'H') {
                ciphertext += 'R';
            } else if (ch == 'L') {
                ciphertext += 'G';
            } else if (ch == 'O') {
                ciphertext += 'U';
            } else {
                ciphertext += ch;
            }
        }
        return ciphertext;
    }
}
