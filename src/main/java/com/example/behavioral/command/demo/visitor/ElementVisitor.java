package com.example.behavioral.command.demo.visitor;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element with uuid: " + je.uuid);
    }

    @Override
    public String visit(Footer footer) {
        return String.format("<footer>%s</footer>", footer.getContent());
    }
}
