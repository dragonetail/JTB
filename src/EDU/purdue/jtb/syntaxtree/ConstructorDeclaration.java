/* Generated by JTB */
package EDU.purdue.jtb.syntaxtree;

import EDU.purdue.jtb.visitor.*;

/**
 * JTB node class for the production ConstructorDeclaration:<br>
 * Corresponding grammar:<br>
 * f0 -> [ TypeParameters() ]<br>
 * f1 -> < IDENTIFIER ><br>
 * f2 -> FormalParameters()<br>
 * f3 -> [ #0 "throws" #1 NameList() ]<br>
 * f4 -> "{"<br>
 * f5 -> [ ExplicitConstructorInvocation() ]<br>
 * f6 -> ( BlockStatement() )*<br>
 * f7 -> "}"<br>
 */
public class ConstructorDeclaration implements INode {

  /** Child node 1 */
  public NodeOptional f0;

  /** Child node 2 */
  public NodeToken f1;

  /** Child node 3 */
  public FormalParameters f2;

  /** Child node 4 */
  public NodeOptional f3;

  /** Child node 5 */
  public NodeToken f4;

  /** Child node 6 */
  public NodeOptional f5;

  /** Child node 7 */
  public NodeListOptional f6;

  /** Child node 8 */
  public NodeToken f7;

  /** The serial version UID */
  private static final long serialVersionUID = 1L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   * @param n3 - next child node
   * @param n4 - next child node
   * @param n5 - next child node
   * @param n6 - next child node
   * @param n7 - next child node
   */
  public ConstructorDeclaration(final NodeOptional n0, final NodeToken n1, final FormalParameters n2, final NodeOptional n3, final NodeToken n4, final NodeOptional n5, final NodeListOptional n6, final NodeToken n7) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
    f6 = n6;
    f7 = n7;
  }

  /**
   * Accepts the IRetArguVisitor visitor.
   *
   * @param <R> the user return type
   * @param <A> the user argument type
   * @param vis - the visitor
   * @param argu - a user chosen argument
   * @return a user chosen return information
   */
  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  /**
   * Accepts the IRetVisitor visitor.
   *
   * @param <R> the user return type
   * @param vis - the visitor
   * @return a user chosen return information
   */
  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  /**
   * Accepts the IVoidArguVisitor visitor.
   *
   * @param <A> the user argument type
   * @param vis - the visitor
   * @param argu - a user chosen argument
   */
  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  /**
   * Accepts the IVoidVisitor visitor.
   *
   * @param vis - the visitor
   */
  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
