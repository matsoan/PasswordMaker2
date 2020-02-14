package PasswordMaker2;
import java.util.Random;
class PassMaker{
    private StringBuilder password = new StringBuilder();
    private int longitud = 8;

    void generarPassword(){
        int longitud = this.longitud;
        Random rd = new Random();
        int numRandom;
        char charRandom;
        int selector;
        for(int i=0; i<longitud; i++){
            selector = rd.nextInt(3);
            switch(selector){
                case 0:
                    numRandom = 48 + rd.nextInt(10);
                    charRandom = (char)(numRandom);
                    this.password.append(charRandom);
                    break;
                case 1:
                    numRandom = 65 + rd.nextInt(10);
                    charRandom = (char)(numRandom); 
                    this.password.append(charRandom);
                    break;
                case 2:
                    numRandom = 97 + rd.nextInt(10);
                    charRandom = (char)(numRandom);
                    this.password.append(charRandom);
                    break;
                default:
                this.password.append("---ERROR---");
            }
        }
        System.out.println(this.password);
    }
    boolean esFuerte(StringBuilder pwd){
        int upperCont = 0, lowerCont = 0, numbCont = 0;
        int charAscii;
        for (int i = 0; i<pwd.length(); i++){
            charAscii=(int)pwd.charAt(i);
            if(charAscii >= 48 && charAscii <= 57){
                numbCont++;
            }else{
                if(charAscii >= 65 && charAscii <= 90){
                    upperCont++;
                }else{
                    if(charAscii >= 97 && charAscii <= 122){
                        lowerCont++;
                    }
                }
            }   
        }
        System.out.println(upperCont + " Mayus, " + lowerCont + " Minus, " + numbCont + " Numb");

        if((upperCont>2) && (lowerCont>1) && (numbCont>5)){
            return true;
        }else{
            return false;
        }
    }
    public StringBuilder getPassword(){
        return this.password;
    }

    public void setPassword(int len){
        this.longitud = len;
        generarPassword();
    }

    PassMaker(){
        
        setPassword(this.longitud);
    }   
    PassMaker(int longitud){
        if (longitud<1){
            setPassword(this.longitud);
        }else{
            setPassword(longitud);
        }
        
    }
   
}