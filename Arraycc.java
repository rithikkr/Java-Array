public class Arraycc {
    
    public static String linearSearch(String menu[], String item){
        for(int i = 0; i < menu.length; i ++){
            if (menu[i].equals(item)) {
                return Integer.toString(i);
            }
        }
        return Integer.toString(-1);
    }

    public static void main(String[] args) {
        String menu[] = {"dosa", "idli", "samosa"};
        String item = "idli";

        String index = linearSearch(menu, item);
        if(index.equals(Integer.toString(-1))) {
            System.out.print("Item not found");
        }else{
            System.out.print("Item found " + index);
        }
    }
}
