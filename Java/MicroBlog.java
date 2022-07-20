class MicroBlog {
    public String truncate(String input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
            
        int[] numbers = input.codePoints().toArray();
      
        if(numbers.length < 6 ){
            return input;
        }else{
           return new String(numbers, 0, 5);
            }
        }
}