/* AES256 Test Source */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        aesUtil encObj = new aesUtil();
        try {
            String plainText = "ghkdtodnf07!@";
            String cipherText = encObj.encryptAES256(plainText);
            System.out.printf("cipher [%s]\n", cipherText);
            System.out.printf("decrypted [%s]\n", encObj.decryptAES256(cipherText));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}