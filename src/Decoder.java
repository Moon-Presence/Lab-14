public class Decoder {
    static final String abc="АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static String decode(String s,int delta){
        String answer="";
        boolean t =true;
        for(int i =0; i<s.length();i++){
            char g =s.charAt(i);
            for(int j =0; j<abc.length();j++){
                if(g == abc.charAt(j)){
                    answer+=abc.charAt((j+delta+abc.length())%abc.length());
                 t= false;break;}
            }
            if (t)  answer+=g;
            t=true;
        }
        return answer;
    }
}
