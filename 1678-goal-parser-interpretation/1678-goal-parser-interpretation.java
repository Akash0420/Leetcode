class Solution {
    public String interpret(String command) {
        
  /*      StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                sb.append("G");
            if (command.charAt(i) == '()')
                sb.append("o");
            if (command.charAt(i) == '(al)')
                sb.append("al");
            else
                sb.append(address.charAt(i));
        }
        
        return sb.toString(); 
    }
}*/
        return command.replace("()", "o").replace("(al)", "al");}}
