package patterns.model;

import patterns.model.Visitor;

public class Table implements Element {
  private String title;

  public Table(String title) {
    this.title = title;
  }

  @Override
  public void print() {
    System.out.println(title);
  }

  @Override
  public void add(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
