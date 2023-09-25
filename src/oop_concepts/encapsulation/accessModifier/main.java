package oop_concepts.encapsulation.accessModifier;

import oop_concepts.encapsulation.accessModifier.request.RequestSchema;

/**
 *
 */
public class main {
    public static void main(String[] args) {
        RequestSchema schema = new RequestSchema();
        System.out.println(schema.getHandler());
    }
}
