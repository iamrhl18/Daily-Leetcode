class Solution {
    public boolean div3(int num){
        return num%3==0;
    }
    public boolean div5(int num){
        return num%5==0;
    }
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(div5(i)&&div3(i)){
                list.add("FizzBuzz");
            }
            else if(div5(i)){
                list.add("Buzz");
            }
            else if(div3(i)){
                list.add("Fizz");
            }
            else list.add(Integer.toString(i));
        }
        return list;
    }
}