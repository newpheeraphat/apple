public String move(String word){
        String result = "";
        for (int i = 0 ; i < word.length() ; i++){
            result = result + (Character.toString((int) (word.charAt(i) + 1)));
        }

        return result;
    }
