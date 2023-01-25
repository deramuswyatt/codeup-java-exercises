public class ServerNameGenerator {
    private static String[] adj = {"nice", "fancy", "groovy", "hateful", "lovely", "black", "soft", "hard", "smart", "pleasant"};
    private static String[] noun = {"Mj", "rat", "toe", "pants", "cup", "television", "plug", "console", "controller", "window"};

    private static String randomEl(String[] strings){
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String serverName (String[] arr1, String[] arr2) {
        String adj = randomEl(arr1);
        String noun = randomEl(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name ");
        System.out.println(serverName(adj, noun));
    }
}
