    public String decodeString(String s) {
             Stack<Integer> count1 = new Stack();
        Stack<String> result = new Stack();
        String res = "";
        int index = 0;
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count2 = 0;
                while(Character.isDigit(s.charAt(index))){
                    count2 = 10 * count2 + (s.charAt(index) - '0');
                    index += 1;
        }
                count1.push(count2);
    }else if(s.charAt(index) == '['){
        result.push(res);
        res = "";
        index += 1;
    }else if(s.charAt(index) == ']'){
        StringBuilder temp = new StringBuilder(result.pop());
        int count2 = count1.pop();
        for(int i = 0; i < count2; i++){
            temp.append(res);     
    }
      res = temp.toString();
      index += 1;
}else {
        res += s.charAt(index);
        index += 1;
    }
        }
        return res;
    
    }
}