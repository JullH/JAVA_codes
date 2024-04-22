package src.base.day21;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {


    }

    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        dao.save("003",new User(3,28,"smith"));

        List<User> list = dao.list();
        System.out.println(list);

        dao.update("003",new User(3,58,"milan"));
        dao.delete("001");
        list = dao.list();
        System.out.println(list);

        System.out.println(dao.get("003"));

    }
}
/*分别创建以下方法:
        (1)public void save(String id,T entity): 保存丅 类型的对象到 Map 成员变量
        (2)public T get(String id):从 map 中获取 id 对应的对象
        (3)public void update(string id,T entity):普换 map 中key为id的内容,改为 entity 对象
        (4)public List<T> list():返回 map 中存放的所有 T 对象 光
        (5)public void delete(String id):删除指定 id 对象
 */
class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        map.put(id, entity);
    }

    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();

        for (String key : map.keySet()) {
            list.add(get(key));
        }

        return list;
    }

    public void delete(String id){
        map.remove(id);
    }

    public void save(String id,T entity){
        map.put(id,entity);
    }

}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}