package july31th;
    class Bunny extends Animal{     //🐇类继承动物类
        public void printName(){
        sound="咕咕";    
        name="福贵";
        }
        void shout(){   //重写了父类的shout方法
            System.out.println("gugu~");
        }
    }
//在需要在子类中对父类方法进行修改的场合,可以使用父类方法重写.不会影响到其他子类的方法调用.
//⚠重写时,方法名,参数序列和返回值类型必须相同
//实际上,重写后只会运行子类中的重写方法.相当于原父类方法被子类方法覆盖了.

//*子类重写父类方法时,不能使用比父类中被重写的方法更严格的访问权限.
//比如说,父类中的方法是public级,子类方法就不能为public级以下