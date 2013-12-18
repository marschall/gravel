package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.LiteralNode;
import org.gravel.support.compiler.ast.LiteralNode.LiteralNode_Factory;
import org.gravel.support.compiler.ast.NodeVisitor;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.SourcePrinter;
import org.gravel.support.compiler.ast.SourcePosition;

public class BooleanLiteralNode extends LiteralNode implements Cloneable {

	public static BooleanLiteralNode_Factory factory = new BooleanLiteralNode_Factory();

	boolean _value;

	public static class BooleanLiteralNode_Factory extends LiteralNode_Factory {

		public BooleanLiteralNode basicNew() {
			BooleanLiteralNode newInstance = new BooleanLiteralNode();
			newInstance.initialize();
			return newInstance;
		}

		public BooleanLiteralNode r_false() {
			return this.value_(false);
		}

		public BooleanLiteralNode r_true() {
			return this.value_(true);
		}

		public BooleanLiteralNode value_(final boolean _aBoolean) {
			return ((BooleanLiteralNode) this.basicNew().initializeValue_(_aBoolean));
		}
	}

	static public BooleanLiteralNode _r_false(Object receiver) {
		return factory.r_false();
	}

	static public BooleanLiteralNode _r_true(Object receiver) {
		return factory.r_true();
	}

	static public BooleanLiteralNode _value_(Object receiver, final boolean _aBoolean) {
		return factory.value_(_aBoolean);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitBooleanLiteralNode_(this);
	}

	@Override
	public BooleanLiteralNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public BooleanLiteralNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return BooleanLiteralNode.this;
			}
		});
		return this;
	}

	public BooleanLiteralNode copy() {
		try {
			BooleanLiteralNode _temp1 = (BooleanLiteralNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean equals(final Object _anObject) {
		if (!super.equals(_anObject)) {
			return false;
		}
		if (!org.gravel.support.jvm.BooleanExtensions.equals_(this._value, ((BooleanLiteralNode) _anObject)._value)) {
			return false;
		}
		return true;
	}

	public BooleanLiteralNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ (_value ? 1 : 0));
	}

	public BooleanLiteralNode initializeValue_(final boolean _aBoolean) {
		_value = _aBoolean;
		this.initialize();
		return this;
	}

	@Override
	public BooleanLiteralNode innerSourceOn_(final StringBuilder _aStream) {
		if (_value) {
			_aStream.append("true");
		} else {
			_aStream.append("false");
		}
		return this;
	}

	@Override
	public boolean isBooleanLiteralNode() {
		return true;
	}

	@Override
	public BooleanLiteralNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public BooleanLiteralNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public BooleanLiteralNode printOn_(final StringBuilder _aStream) {
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
	public BooleanLiteralNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public BooleanLiteralNode sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return BooleanLiteralNode.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	@Override
	public Boolean value() {
		return _value;
	}

	@Override
	public BooleanLiteralNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public BooleanLiteralNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public BooleanLiteralNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return BooleanLiteralNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
