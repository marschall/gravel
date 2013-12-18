package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.MessageSendRewriter;
import org.gravel.support.compiler.ast.MessageSendRewriter.MessageSendRewriter_Factory;
import java.util.HashMap;
import org.gravel.support.compiler.ast.Statement;
import org.gravel.support.compiler.ast.MessageNode;
import org.gravel.support.compiler.ast.BlockNode;
import org.gravel.support.compiler.ast.NilLiteralNode;
import org.gravel.support.compiler.ast.TypeVariableNode;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.BooleanAndNode;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.SequenceNode;
import org.gravel.support.compiler.ast.ArrayAtNode;
import org.gravel.support.compiler.ast.ArrayAtPutNode;
import org.gravel.support.compiler.ast.IdentityComparisonNode;
import org.gravel.support.compiler.ast.IfTrueIfFalseNode;
import org.gravel.support.compiler.ast.TypeOrNode;
import org.gravel.support.compiler.ast.BooleanOrNode;
import org.gravel.support.compiler.ast.ToDoNode;
import org.gravel.support.compiler.ast.IntegerLiteralNode;
import org.gravel.support.compiler.ast.WhileFalseNode;
import org.gravel.support.compiler.ast.WhileTrueNode;
import org.gravel.support.compiler.ast.ArraySizeNode;
import org.gravel.support.compiler.ast.IsNilNode;

public class IntermediateNodeRewriter extends MessageSendRewriter implements Cloneable {

	public static IntermediateNodeRewriter_Factory factory = new IntermediateNodeRewriter_Factory();

	public static class IntermediateNodeRewriter_Factory extends MessageSendRewriter_Factory {

		public IntermediateNodeRewriter basicNew() {
			IntermediateNodeRewriter newInstance = new IntermediateNodeRewriter();
			newInstance.initialize();
			return newInstance;
		}
	}

	public IntermediateNodeRewriter copy() {
		try {
			IntermediateNodeRewriter _temp1 = (IntermediateNodeRewriter) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public IntermediateNodeRewriter_Factory factory() {
		return factory;
	}

	@Override
	public IntermediateNodeRewriter initialize() {
		super.initialize();
		this.initializeSpecialSelectors();
		return this;
	}

	@Override
	public IntermediateNodeRewriter initializeSpecialSelectors() {
		_specialSelectors = new java.util.HashMap<org.gravel.core.Symbol, org.gravel.support.jvm.Block1<Statement, MessageNode>>();
		_specialSelectors.put(org.gravel.core.Symbol.value("ifTrue:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_ifTrue_(_node.receiver(), ((BlockNode) _node.argument()));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("ifFalse:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_ifFalse_(_node.receiver(), ((BlockNode) _node.argument()));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("ifTrue:ifFalse:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_ifTrue_ifFalse_(_node.receiver(), ((BlockNode) (_node.arguments()[0])), ((BlockNode) (_node.arguments()[1])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("ifFalse:ifTrue:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_ifTrue_ifFalse_(_node.receiver(), ((BlockNode) (_node.arguments()[1])), ((BlockNode) (_node.arguments()[0])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("whileTrue"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce$underscore$whileTrue_(((BlockNode) _node.receiver()));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("whileFalse"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce$underscore$whileFalse_(((BlockNode) _node.receiver()));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("whileTrue:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_whileTrue_(((BlockNode) _node.receiver()), ((BlockNode) (_node.arguments()[0])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("whileFalse:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_whileFalse_(((BlockNode) _node.receiver()), ((BlockNode) (_node.arguments()[0])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("to:do:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_to_do_(_node.receiver(), _node.arguments()[0], ((BlockNode) (_node.arguments()[1])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("to:by:do:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_to_by_do_(_node.receiver(), _node.arguments()[0], _node.arguments()[1], ((BlockNode) (_node.arguments()[2])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("=="), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_identityEquals_(_node.receiver(), _node.arguments()[0]);
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("and:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_and_(_node.receiver(), ((BlockNode) (_node.arguments()[0])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("or:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_or_(_node.receiver(), ((BlockNode) (_node.arguments()[0])));
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("basicSize"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce$underscore$basicSize_(_node.receiver());
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("basicAt:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_basicAt_(_node.receiver(), _node.arguments()[0]);
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("basicAt:put:"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce_basicAt_put_(_node.receiver(), _node.arguments()[0], _node.arguments()[1]);
			}
		});
		_specialSelectors.put(org.gravel.core.Symbol.value("isNil"), new org.gravel.support.jvm.Block1<Statement, MessageNode>() {

			@Override
			public Statement value_(final MessageNode _node) {
				return (Statement) IntermediateNodeRewriter.this.produce$underscore$isNil_(_node.receiver());
			}
		});
		return this;
	}

	public BlockNode nilReturningBlockNode() {
		return BlockNode.factory.expression_returnType_(NilLiteralNode.factory.basicNew(), TypeVariableNode.factory.nil());
	}

	public ArraySizeNode produce$underscore$basicSize_(final Expression _expression) {
		return ArraySizeNode.factory.receiver_(((Expression) this.visit_(_expression)));
	}

	public IsNilNode produce$underscore$isNil_(final Expression _expression) {
		return IsNilNode.factory.receiver_(((Expression) this.visit_(_expression)));
	}

	public WhileFalseNode produce$underscore$whileFalse_(final BlockNode _testBlockNode) {
		return WhileFalseNode.factory.testSequence_doSequence_(((SequenceNode) this.visit_(_testBlockNode.body())), null);
	}

	public WhileTrueNode produce$underscore$whileTrue_(final BlockNode _testBlockNode) {
		return WhileTrueNode.factory.testSequence_doSequence_(((SequenceNode) this.visit_(_testBlockNode.body())), null);
	}

	public BooleanAndNode produce_and_(final Node _receiver, final BlockNode _blockNode) {
		return BooleanAndNode.factory.left_right_(((Expression) this.visit_(_receiver)), ((SequenceNode) this.visit_(_blockNode.body())));
	}

	public ArrayAtNode produce_basicAt_(final Expression _receiver, final Expression _index) {
		return ArrayAtNode.factory.receiver_index_(((Expression) this.visit_(_receiver)), ((Expression) this.visit_(_index)));
	}

	public ArrayAtPutNode produce_basicAt_put_(final Expression _receiver, final Expression _index, final Expression _value) {
		return ArrayAtPutNode.factory.receiver_index_value_(((Expression) this.visit_(_receiver)), ((Expression) this.visit_(_index)), ((Expression) this.visit_(_value)));
	}

	public IdentityComparisonNode produce_identityEquals_(final Node _receiver, final Node _anObject) {
		return IdentityComparisonNode.factory.left_right_(((Expression) this.visit_(_receiver)), ((Expression) this.visit_(_anObject)));
	}

	public IfTrueIfFalseNode produce_ifFalse_(final Node _receiver, final BlockNode _aBlockNode) {
		return this.produce_ifTrue_ifFalse_(_receiver, this.nilReturningBlockNode(), _aBlockNode);
	}

	public IfTrueIfFalseNode produce_ifTrue_(final Node _receiver, final BlockNode _aBlockNode) {
		return this.produce_ifTrue_ifFalse_(_receiver, _aBlockNode, this.nilReturningBlockNode());
	}

	public IfTrueIfFalseNode produce_ifTrue_ifFalse_(final Node _receiver, final BlockNode _trueBlockNode, final BlockNode _falseBlockNode) {
		return IfTrueIfFalseNode.factory.test_trueSequence_falseSequence_returnType_(((Expression) this.visit_(_receiver)), ((SequenceNode) this.visit_(_trueBlockNode.body())), ((SequenceNode) this.visit_(_falseBlockNode.body())), TypeOrNode.factory.left_right_(_trueBlockNode.returnType(), _falseBlockNode.returnType()));
	}

	public BooleanOrNode produce_or_(final Node _receiver, final BlockNode _blockNode) {
		return BooleanOrNode.factory.left_right_(((Expression) this.visit_(_receiver)), ((SequenceNode) this.visit_(_blockNode.body())));
	}

	public ToDoNode produce_to_by_do_(final Expression _start, final Expression _stop, final Expression _step, final BlockNode _loopBlockNode) {
		return ToDoNode.factory.start_stop_step_counterName_doSequence_(((Expression) this.visit_(_start)), ((Expression) this.visit_(_stop)), ((Expression) this.visit_(_step)), _loopBlockNode.arguments()[0].name(), ((SequenceNode) this.visit_(_loopBlockNode.body())));
	}

	public ToDoNode produce_to_do_(final Expression _start, final Expression _stop, final BlockNode _loopBlockNode) {
		return ToDoNode.factory.start_stop_step_counterName_doSequence_(((Expression) this.visit_(_start)), ((Expression) this.visit_(_stop)), IntegerLiteralNode.factory.integer_(((java.math.BigInteger) java.math.BigInteger.ONE)), _loopBlockNode.arguments()[0].name(), ((SequenceNode) this.visit_(_loopBlockNode.body())));
	}

	public WhileFalseNode produce_whileFalse_(final BlockNode _testBlockNode, final BlockNode _loopBlockNode) {
		return WhileFalseNode.factory.testSequence_doSequence_(((SequenceNode) this.visit_(_testBlockNode.body())), ((SequenceNode) this.visit_(_loopBlockNode.body())));
	}

	public WhileTrueNode produce_whileTrue_(final BlockNode _testBlockNode, final BlockNode _loopBlockNode) {
		return WhileTrueNode.factory.testSequence_doSequence_(((SequenceNode) this.visit_(_testBlockNode.body())), ((SequenceNode) this.visit_(_loopBlockNode.body())));
	}
}
