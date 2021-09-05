public char toLower(char ch){
        return Character.toLowerCase(ch);
    }

public char toUpper(char ch){
    return Character.toUpperCase(ch);
}


public String reverseCase(String str){
    Character[] lst = new Character[str.length()];
    int _pos = 0;
    for (int i = 0 ; i < str.length() ; i++){
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
            lst[_pos] = this.toLower(str.charAt(i));
            _pos++;
        } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
            lst[_pos] = this.toUpper(str.charAt(i));
            _pos++;
        } else {
            lst[_pos] = str.charAt(i);
            _pos++;
        }
    }
    String result = "";
    for (Character ch : lst){
        result = result + ch;
    }
    return result;
}
