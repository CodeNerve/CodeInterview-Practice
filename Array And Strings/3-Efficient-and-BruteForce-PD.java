public static String URLify(String str, int length){

    char[] strChars = str.toCharArray();
    int numSpaces = 0;
    
    for (int i = 0; i < length; i++) {
        if(strChars[i] == ' ') 
            numSpaces++;
    }

    int insert = length + 2*numSpaces - 1;
    
    for (int i = length - 1; i >= 0; i--) {
        char c = strChars[i];
        if (c == ' '){
            strChars[insert--] = '0';
            strChars[insert--] = '2';
            strChars[insert--] = '%';
        } 
        else 
            strChars[insert--] = c;
    }
    
    return String.valueOf(strChars);
}
