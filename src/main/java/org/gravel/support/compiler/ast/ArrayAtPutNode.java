package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.ArrayAccessNode;
import org.gravel.support.compiler.ast.ArrayAccessNode.ArrayAccessNode_Factory;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.NodeVisitor;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.SourcePrinter;
import org.gravel.support.compiler.ast.SourcePosition;

public class ArrayAtPutNode extends ArrayAccessNode implements Cloneable {

	public static ArrayAtPutNode_Factory factory = new ArrayAtPutNode_Factory();

	Expression _index;

	Expression _value;

	public static class ArrayAtPutNode_Factory extends ArrayAccessNode_Factory {

		public ArrayAtPutNode basicNew() {
			ArrayAtPutNode newInstance = new ArrayAtPutNode();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public ArrayAtPutNode receiver_(final Expression _anExpression) {
			return ((ArrayAtPutNode) this.basicNew().initializeReceiver_(_anExpression));
		}

		public ArrayAtPutNode receiver_index_value_(final Expression _anExpression, final Expression _anExpression2, final Expression _anExpression3) {
			return this.basicNew().initializeReceiver_index_value_(_anExpression, _anExpression2, _anExpression3);
		}
	}

	static public ArrayAtPutNode _receiver_(Object receiver, final Expression _anExpression) {
		return factory.receiver_(_anExpression);
	}

	static public ArrayAtPutNode _receiver_index_value_(Object receiver, final Expression _anExpression, final Expression _anExpression2, final Expression _anExpression3) {
		return factory.receiver_index_value_(_anExpression, _anExpression2, _anExpression3);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitArrayAtPutNode_(this);
	}

	@Override
	public ArrayAtPutNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ArrayAtPutNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ArrayAtPutNode.this;
			}
		});
		return this;
	}

	public ArrayAtPutNode copy() {
		try {
			ArrayAtPutNode _temp1 = (ArrayAtPutNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ArrayAtPutNode_Factory factory() {
		return factory;
	}

	public Expression index() {
		return _index;
	}

	@Override
	public ArrayAtPutNode initializeReceiver_(final Expression _anExpression) {
		_receiver = _anExpression;
		this.initialize();
		return this;
	}

	public ArrayAtPutNode initializeReceiver_index_value_(final Expression _anExpression, final Expression _anExpression2, final Expression _anExpression3) {
		_receiver = _anExpression;
		_index = _anExpression2;
		_value = _anExpression3;
		this.initialize();
		return this;
	}

	@Override
	public ArrayAtPutNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{");
		_receiver.sourceOn_(_aStream);
		_aStream.append(" at: ");
		_index.sourceOn_(_aStream);
		_aStream.append("}");
		return this;
	}

	@Override
	public ArrayAtPutNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public ArrayAtPutNode nodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_receiver);
		_aBlock.value_(_index);
		_aBlock.value_(_value);
		return this;
	}

	@Override
	public ArrayAtPutNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ArrayAtPutNode printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(org.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public ArrayAtPutNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public Expression receiver() {
		return _receiver;
	}

	@Override
	public ArrayAtPutNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public Expression unoptimized() {
		return _receiver.send_with_with_("at:put:", _index, _value);
	}

	public Expression value() {
		return _value;
	}

	@Override
	public ArrayAtPutNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ArrayAtPutNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public ArrayAtPutNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ArrayAtPutNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
