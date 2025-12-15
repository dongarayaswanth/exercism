class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capital = false;
        for (char c: identifier.toCharArray()){
            if(c == ' '){
                result.append('_');
            }
            if(c == '-')    capital = true;
            switch(c){
                case '4': c = 'a';break;
                case '3': c = 'e';break;
                case '0': c = 'o';break;
                case '1': c = 'l';break;
                case '7': c = 't';break;
            }
            if(!Character.isLetter(c)){
                continue;
            }
            if(capital){
                c = Character.toUpperCase(c);
                capital = false;
            }
            result.append(c);
        }
    return result.toString();
    }
    
}
