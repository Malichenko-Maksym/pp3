class Numbers {
    private int i1;
    private int i2;
    private int i3;
    private int i4;
    private int i5;

    public Numbers(int i1, int i2, int i3, int i4, int i5) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.i5 = i5;
    }

    public boolean different(){
        if(i1==i2 || i1==i3 || i1==i4 || i1==i5 || i2==i3 || i2==i4 || i2==i5 || i3==i4 || i3==i5 || i4==i5){
            return false; }
        else {
            return true;
        }
    }
}