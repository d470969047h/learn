package effectivejava.chapter2.item2.builder;

/**
 * @Description:
 * @Date: Created in 9:00 下午 2020/4/15
 * @Author: daihui
 * @Modified By:
 */
public class User {

    private String name;

    private String sex;

    private User(Builder builder){
        this.name = builder.name;
        this.sex = builder.sex;
    }

    public static class Builder{
        private String name;
        private String sex;

        public Builder(){}

        // 必传参数
        public Builder(String name){
            this.name = name;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder sex(String sex){
            this.sex = sex;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
    public static void main(String[] args) {
        User user1 = new Builder().name("甲").sex("男").build();
        User user2 = new Builder("乙").sex("女").build();
        System.out.println(user1);
        System.out.println(user2);
    }

}
