class Sol{
  public int minNumberOperations(int[] target){

    int n = target.length;
    int count = target[0];
    int diff;

    for(int i = 1; i < n; i++){
      if(target[i] > target[i - 1]){
        diff = target[i] - target[i - 1];
        count += diff;
      }
    }


    return count;
  }

  public static void main(String[] args) {
    Sol sol = new Sol();
    int[] target = {1, 2, 3, 2, 1};
    System.out.println(sol.minNumberOperations(target));
  }
}