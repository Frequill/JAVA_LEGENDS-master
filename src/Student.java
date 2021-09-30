class Student{

    private String name;
    private int age;
    private int damage;
    private int hp;

    public Student(String name, int age, int damage, int hp){
        this.name = name;
        this.age = age;
        this.damage = damage;
        this.hp = hp;
    }

    public String toString(){
        System.out.println("Namn: " + name);
        System.out.println("Ålder: " + age);
        System.out.println("Styrka: " + damage);
        System.out.println("Liv: " + hp);
        String s = name + "\n" + age;
        return s;
    }

    public int getStrength(){
        return this.damage;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public String getName(){
        return this.name;
    }












}
