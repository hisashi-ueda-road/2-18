package person;
    public class Task2_18 {
        public static void main(String[] args) {
        //問② Personクラスをインスタンス化し、名前「山田太郎」 年齢「23」 住所「東京都」 をカプセル化されたsetterで設定して下さい。
            Person person = new Person("", 0, "");
            person.setName("山田太郎");
            person.setAge(23);
            person.setAddles("東京都");
        


        //問③ 設定した名前・年齢・住所をカプセル化されたgetterで呼び出してして下さい。
            System.out.println("名前は、" + person.getName()+"です。");
            System.out.println("年齢は、" + person.getAge()+"才です。");
            System.out.println("住所は、" + person.getAddles()+"です。");
        }
    }

    class Person {
    private String name;
    private int age;
    private String addles;
    //問① 上記変数に従って、getterとsetterを設定して下さい。
    public Person(String name, int age, String addles) {
        this.name = name;
        this.age = age;
        this.addles = addles;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddles() {
        return addles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddles(String addles) {
        this.addles = addles;
    }
   }