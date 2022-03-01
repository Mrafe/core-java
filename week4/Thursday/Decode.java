package week4.Thursday;

class Decode {
    public static void main(String[] args) {
        String secretMessage = "Bzwarz!1It9is3java2whzn1you5arz4using3phonzs8during1thz9szssions";
        System.out.println(secretMessage);
        String decodedMessage = secretMessage.replaceAll("z", "e").replaceAll("\\d", " ")
                .replaceFirst("java", "obvious").toUpperCase();
        System.out.println(decodedMessage);
    }
}
