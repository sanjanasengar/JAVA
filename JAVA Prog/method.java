public class method {
    
    public static void main(String[]args){

        String stringVar="String  Variable";
        System.out.println(stringVar.toUpperCase());
        System.out.println(stringVar.charAt(2));
        System.out.println(stringVar.codePointAt(4));
        System.out.println(stringVar.split("String"));
        System.out.println(stringVar.codePointBefore(2));
        System.out.println(stringVar.codePointBefore(3));
        System.out.println(stringVar.concat(" value"));
        System.out.println(stringVar.replaceFirst("String", "Stringgs"));
        System.out.println(stringVar.matches("String"));
        System.out.println(stringVar.contains("String"));
        System.out.println(stringVar.length());
        System.out.println(stringVar.lastIndexOf("Variable"));
        System.out.println(stringVar.indexOf(6));
        System.out.println(stringVar.isEmpty());
        System.out.println(stringVar.offsetByCodePoints(4, 5));
        System.out.println(stringVar.startsWith("String", 3));
        // System.out.println(stringVar.getChars(0, 4, null, 3));
        
        


    }
    
}
