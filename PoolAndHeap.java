public class PoolAndHeap {
    public static void main(String[] args) {
        String str1 = "Java"; //1 slot use in pool
        String str2 = "Java"; //Do not use any slot in the pool because uses same slot mentioned above
        String str3 = new String ("Java"); //   This is different from the mentioned above situations because
                                                    //  this is new object and uses HEAP not POOL!!
    }
}
