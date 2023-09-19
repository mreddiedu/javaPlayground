package accessModifier;

import accessModifier.request.RequestSchema;

public class main {
    public static void main(String[] args) {
        RequestSchema schema = new RequestSchema();
        System.out.println(schema.getHandler());

        System.out.println(schema.getHandler().handle());
    }
}
