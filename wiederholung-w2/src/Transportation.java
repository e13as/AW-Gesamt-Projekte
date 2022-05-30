public class Transportation {

    public static boolean isValidTicketId(String id) {
        boolean valid = false;
        if (id.length() == 7 && id.charAt(3) == '-'){
            try{
                int num1 = Integer.parseInt(id.substring(0,3));
                int num2 = Integer.parseInt(id.substring(4,id.length()));

                if (num1 % 5 == 0 && num2 % 3 == 0){
                    valid = true;

                }


            }catch (Exception e){//NumberFormatException e){
                System.out.println("ist ein Fehler"+e);
            }
        }
        return valid;
    }


}
