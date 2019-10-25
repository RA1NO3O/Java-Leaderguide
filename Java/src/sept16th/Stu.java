package sept16th;
class Stu{
    private String id;
    private String name;
    public Stu(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+":"+name;
    }
    public int HashCode(){
        return id.hashCode();
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Stu)){
            return false;
        }
        Stu stu=(Stu) obj;
        boolean b=this.id.equals(stu.id);
        return b;
    }
}