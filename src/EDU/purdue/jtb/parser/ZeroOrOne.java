/* Copyright (c) 2006, Sun Microsystems, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Sun Microsystems, Inc. nor the names of its
 *       contributors may be used to endorse or promote products derived from
 *       this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package EDU.purdue.jtb.parser;

import java.util.Set;

/**
 * Describes zero-or-one expansions (e.g., [foo], foo?).
 * 
 * @author Marc Mazas
 * @version 1.4.0 : 05/2009 : MMa : adapted to JavaCC v4.2 grammar
 * @version 1.4.8 : 12/2014 : MMa : improved javadoc
 */
public class ZeroOrOne extends Expansion_ {

  /**
   * The expansion which is repeated zero or one times.
   */
  public Expansion_ expansion;

  /** Standard constructor */
  public ZeroOrOne() {
    expType = EXP_TYPE.ZERO_OR_ONE;
  }

  /**
   * Constructor with parameters
   * 
   * @param t - the token
   * @param e - the node
   */
  public ZeroOrOne(final Token t, final Expansion_ e) {
    this();
    this.setLine(t.beginLine);
    this.setColumn(t.beginColumn);
    this.expansion = e;
    e.parent = this;
  }

  /** {@inheritDoc} */
  @Override
  public StringBuilder dump(final int indent, final Set<Object> alreadyDumped) {
    final StringBuilder sb = super.dump(indent, alreadyDumped);
    if (alreadyDumped.contains(this))
      return sb;
    alreadyDumped.add(this);
    sb.append(EOL).append(expansion.dump(indent + 1, alreadyDumped));
    return sb;
  }
}
