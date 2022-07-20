class ReverseString {

    String reverse(String inputString) {
     StringBuilder input = new StringBuilder(inputString);
        input.reverse();
        return input.toString();
    }
  
}