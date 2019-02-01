package org.java.p04_template_method.extend;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzq on 2018/3/22.
 */
public class Client {

    private static final ThreadLocal<Map<String, Object>> threadLocal = ThreadLocal.withInitial(HashMap::new);

    @Test
    public void t1() {
        Model s = new ModelS();
        Model x = new ModelX();

        s.templateMethod();
        System.out.println("==============华丽的分割线==================");
        x.templateMethod();
    }

    public static void main(String[] args) {
        Map<String, Object> map = threadLocal.get();
        System.out.println(map);
    }

}
