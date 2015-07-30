/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.jexl3;

/**
 * The JEXL operators.
 *
 * These are the operators that are executed by JexlArithmetic methods.
 * <p>
 * Each of them  associates a symbol to a method signature.
 * For instance, '+' is associated to 'T add(L x, R y)'.
 * </p>
 * <p>
 * The default JexlArithmetic implements generic versions of these methods using Object as arguments.
 * You can use your own derived JexlArithmetic that override and/or overload those operator methods; these methods
 * must be public,
 * must respect the return type when primitive
 * and may be overloaded multiple times with different signatures.
 * </p>
 * @since 3.0
 */
public enum JexlOperator {
    /**
     * <strong>Syntax:</strong> <code>x + y</code>
     * <br><strong>Method:</strong> <code>T add(L x, R y);</code>.
     * @see JexlArithmetic#add
     */
    ADD("+", "add", 2),
    /**
     * <strong>Syntax:</strong> <code>x - y</code>
     * <br><strong>Method:</strong> <code>T subtract(L x, R y);</code>.
     * @see JexlArithmetic#subtract
     */
    SUBTRACT("-", "subtract", 2),
    /**
     * <strong>Syntax:</strong> <code>x * y</code>
     * <br><strong>Method:</strong> <code>T multiply(L x, R y);</code>.
     * @see JexlArithmetic#multiply
     */
    MULTIPLY("*", "multiply", 2),
    /**
     * <strong>Syntax:</strong> <code>x / y</code>
     * <br><strong>Method:</strong> <code>T divide(L x, R y);</code>.
     * @see JexlArithmetic#divide
     */
    DIVIDE("/", "divide", 2),
    /**
     * <strong>Syntax:</strong> <code>x % y</code>
     * <br><strong>Method:</strong> <code>T mod(L x, R y);</code>.
     * @see JexlArithmetic#mod
     */
    MOD("%", "mod", 2),
    /**
     * <strong>Syntax:</strong> <code>x & y</code>
     * <br><strong>Method:</strong> <code>T and(L x, R y);</code>.
     * @see JexlArithmetic#and
     */
    AND("&", "and", 2),
    /**
     * <strong>Syntax:</strong> <code>x | y</code>
     * <br><strong>Method:</strong> <code>T or(L x, R y);</code>.
     * @see JexlArithmetic#or
     */
    OR("|", "or", 2),
    /**
     * <strong>Syntax:</strong> <code>x ^ y</code>
     * <br><strong>Method:</strong> <code>T xor(L x, R y);</code>.
     * @see JexlArithmetic#xor
     */
    XOR("^", "xor", 2),
    /**
     * <strong>Syntax:</strong> <code>x == y</code>
     * <br><strong>Method:</strong> <code>boolean equals(L x, R y);</code>.
     * @see JexlArithmetic#equals
     */
    EQ("==", "equals", 2),
    /**
     * <strong>Syntax:</strong> <code>x < y</code>
     * <br><strong>Method:</strong> <code>boolean lessThan(L x, R y);</code>.
     * @see JexlArithmetic#lessThan
     */
    LT("<", "lessThan", 2),
    /**
     * <strong>Syntax:</strong> <code>x <= y</code>
     * <br><strong>Method:</strong> <code>boolean lessThanOrEqual(L x, R y);</code>.
     * @see JexlArithmetic#lessThanOrEqual
     */
    LTE("<=", "lessThanOrEqual", 2),
    /**
     * <strong>Syntax:</strong> <code>x > y</code>
     * <br><strong>Method:</strong> <code>boolean greaterThan(L x, R y);</code>.
     * @see JexlArithmetic#greaterThan
     */
    GT(">", "greaterThan", 2),
    /**
     * <strong>Syntax:</strong> <code>x >= y</code>
     * <br><strong>Method:</strong> <code>boolean greaterThanOrEqual(L x, R y);</code>.
     * @see JexlArithmetic#greaterThanOrEqual
     */
    GTE(">=", "greaterThanOrEqual", 2),
    /**
     * <strong>Syntax:</strong> <code>x =~ y</code>
     * <br><strong>Method:</strong> <code>boolean contains(L x, R y);</code>.
     * @see JexlArithmetic#contains
     */
    CONTAINS("=~", "contains", 2),
    /**
     * <strong>Syntax:</strong> <code>x =^ y</code>
     * <br><strong>Method:</strong> <code>boolean startsWith(L x, R y);</code>.
     * @see JexlArithmetic#startsWith
     */
    STARTSWITH("=^", "startsWith", 2),
    /**
     * <strong>Syntax:</strong> <code>x =$ y</code>
     * <br><strong>Method:</strong> <code>boolean endsWith(L x, R y);</code>.
     * @see JexlArithmetic#endsWith
     */
    ENDSWITH("=$", "endsWith", 2),
    /**
     * <strong>Syntax:</strong> <code>!x</code>
     * <br><strong>Method:</strong> <code>T not(L x);</code>.
     * @see JexlArithmetic#not
     */
    NOT("!", "not", 1),
    /**
     * <strong>Syntax:</strong> <code>~x</code>
     * <br><strong>Method:</strong> <code>T complement(L x);</code>.
     * @see JexlArithmetic#complement
     */
    COMPLEMENT("~", "complement", 1),
    /**
     * <strong>Syntax:</strong> <code>-x</code>
     * <br><strong>Method:</strong> <code>T negate(L x);</code>.
     * @see JexlArithmetic#negate
     */
    NEGATE("-", "negate", 1),
    /**
     * <strong>Syntax:</strong> <code>empty x</code> or <code>empty(x)</code>
     * <br><strong>Method:</strong> <code>boolean isEmpty(L x);</code>.
     * @see JexlArithmetic#isEmpty
     */
    EMPTY("empty", "empty", 1),
    /**
     * <strong>Syntax:</strong> <code>size x</code> or <code>size(x)</code>
     * <br><strong>Method:</strong> <code>int size(L x);</code>.
     * @see JexlArithmetic#size
     */
    SIZE("size", "size", 1),
    /**
     * <strong>Syntax:</strong> <code>x += y</code>
     * <br><strong>Method:</strong> <code>T selfAdd(L x, R y);</code>.
     */
    SELF_ADD("+=", "selfAdd", ADD),
    /**
     * <strong>Syntax:</strong> <code>x -= y</code>
     * <br><strong>Method:</strong> <code>T selfSubtract(L x, R y);</code>.
     */
    SELF_SUBTRACT("-=", "selfSubtract", SUBTRACT),
    /**
     * <strong>Syntax:</strong> <code>x *= y</code>
     * <br><strong>Method:</strong> <code>T selfMultiply(L x, R y);</code>.
     */
    SELF_MULTIPLY("*=", "selfMultiply", MULTIPLY),
    /**
     * <strong>Syntax:</strong> <code>x /= y</code>
     * <br><strong>Method:</strong> <code>T selfDivide(L x, R y);</code>.
     */
    SELF_DIVIDE("/=", "selfDivide", DIVIDE),
    /**
     * <strong>Syntax:</strong> <code>x %= y</code>
     * <br><strong>Method:</strong> <code>T selfMod(L x, R y);</code>.
     */
    SELF_MOD("%=", "selfMod", MOD),
    /**
     * <strong>Syntax:</strong> <code>x &= y</code>
     * <br><strong>Method:</strong> <code>T selfAnd(L x, R y);</code>.
     */
    SELF_AND("&=", "selfAnd", AND),
    /**
     * <strong>Syntax:</strong> <code>x |= y</code>
     * <br><strong>Method:</strong> <code>T selfOr(L x, R y);</code>.
     */
    SELF_OR("|=", "selfOr", OR),
    /**
     * <strong>Syntax:</strong> <code>x ^= y</code>
     * <br><strong>Method:</strong> <code>T selfXor(L x, R y);</code>.
     */
    SELF_XOR("^=", "selfXor", XOR),
    /**
     * Marker for side effect.
     * <br/>Returns this from 'self*' overload method to let the engine know the side effect has been performed and
     * there is no need to assign the result.
     */
    ASSIGN("=", null, null);
    /**
     * The operator symbol.
     */
    private final String operator;
    /**
     * The associated operator method name.
     */
    private final String methodName;
    /**
     * The method arity (ie number of arguments).
     */
    private final int arity;
    /**
     * The base operator.
     */
    private final JexlOperator base;

    /**
     * Creates a base operator.
     * @param o    the operator name
     * @param m    the method name associated to this operator in a JexlArithmetic
     * @param argc the number of parameters for the method
     */
    JexlOperator(String o, String m, int argc) {
        this.operator = o;
        this.methodName = m;
        this.arity = argc;
        this.base = null;
    }

    /**
     * Creates a side-effect operator.
     * @param o the operator name
     * @param m the method name associated to this operator in a JexlArithmetic
     * @param b the base operator, ie + for +=
     */
    JexlOperator(String o, String m, JexlOperator b) {
        this.operator = o;
        this.methodName = m;
        this.arity = 2;
        this.base = b;
    }

    /**
     * Gets this operator symbol.
     * @return the symbol
     */
    public final String getOperatorSymbol() {
        return operator;
    }

    /**
     * Gets this operator method name in a JexlArithmetic.
     * @return the method name
     */
    public final String getMethodName() {
        return methodName;
    }

    /**
     * Gets this operator number of parameters.
     * @return the method arity
     */
    public int getArity() {
        return arity;
    }

    /**
     * Gets the base operator.
     * @return the base operator
     */
    public final JexlOperator getBaseOperator() {
        return base;
    }

}
