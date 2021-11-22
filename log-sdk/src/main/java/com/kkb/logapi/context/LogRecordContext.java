package com.kkb.logapi.context;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wangbaowei
 */
public class LogRecordContext {

    private static final InheritableThreadLocal<Stack<Map<String, Object>>> variableMapStack = new InheritableThreadLocal<>();

    public static void putVariable(String name, Object value) {
        if (variableMapStack.get() == null) {
            Stack<Map<String, Object>> stack = new Stack<>();
            variableMapStack.set(stack);
        }
        Stack<Map<String, Object>> mapStack = variableMapStack.get();
        if (mapStack.size() == 0) {
            variableMapStack.get().push(new HashMap<>());
        }
        variableMapStack.get().peek().put(name, value);
    }

    public static Object getVariable(String key) {
        Map<String, Object> variableMap = variableMapStack.get().peek();
        return variableMap.get(key);
    }

    public static Map<String, Object> getVariables() {
        Stack<Map<String, Object>> mapStack = variableMapStack.get();
        return mapStack.peek();
    }

    public static void clear() {
        if (variableMapStack.get() != null) {
            variableMapStack.get().pop();
        }
    }

    public static void putEmptySpan() {
        Stack<Map<String, Object>> mapStack = variableMapStack.get();
        if (mapStack == null) {
            Stack<Map<String, Object>> stack = new Stack<>();
            variableMapStack.set(stack);
        }
        variableMapStack.get().push(Maps.newHashMap());
    }
}
