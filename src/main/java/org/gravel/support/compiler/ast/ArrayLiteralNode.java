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

public class ArrayLiteralNode extends LiteralNode implements Cloneable {

	public static ArrayLiteralNode_Factory factory = new ArrayLiteralNode_Factory();

	LiteralNode[] _elements;

	public static class ArrayLiteralNode_Factory extends LiteralNode_Factory {

		public ArrayLiteralNode basicNew() {
			ArrayLiteralNode newInstance = new ArrayLiteralNode();
			newInstance.initialize();
			return newInstance;
		}

		public ArrayLiteralNode elements_(final LiteralNode[] _anArray) {
			return ((ArrayLiteralNode) this.basicNew().initializeElements_(_anArray));
		}

		public ArrayLiteralNode with_with_(final LiteralNode _arg1, final LiteralNode _arg2) {
			return this.elements_(org.gravel.support.jvm.ArrayFactory.with_with_(_arg1, _arg2));
		}
	}

	static public ArrayLiteralNode _elements_(Object receiver, final LiteralNode[] _anArray) {
		return factory.elements_(_anArray);
	}

	static public ArrayLiteralNode _with_with_(Object receiver, final LiteralNode _arg1, final LiteralNode _arg2) {
		return factory.with_with_(_arg1, _arg2);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitArrayLiteralNode_(this);
	}

	@Override
	public ArrayLiteralNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ArrayLiteralNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ArrayLiteralNode.this;
			}
		});
		return this;
	}

	public ArrayLiteralNode copy() {
		try {
			ArrayLiteralNode _temp1 = (ArrayLiteralNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public LiteralNode[] elements() {
		return _elements;
	}

	@Override
	public boolean equals(final Object _anObject) {
		if (!super.equals(_anObject)) {
			return false;
		}
		if (this._elements == null) {
			if (!(((ArrayLiteralNode) _anObject)._elements == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ArrayExtensions.equals_(this._elements, ((ArrayLiteralNode) _anObject)._elements)) {
				return false;
			}
		}
		return true;
	}

	public ArrayLiteralNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ java.util.Arrays.hashCode(_elements));
	}

	public ArrayLiteralNode initializeElements_(final LiteralNode[] _anArray) {
		_elements = _anArray;
		this.initialize();
		return this;
	}

	@Override
	public ArrayLiteralNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("#(");
		boolean _temp1 = true;
		for (final LiteralNode _each : _elements) {
			if (_temp1) {
				_temp1 = false;
			} else {
				_aStream.append(' ');
			}
			_each.sourceOn_(_aStream);
		}
		_aStream.append(')');
		return this;
	}

	@Override
	public boolean isArrayLiteralNode() {
		return true;
	}

	@Override
	public ArrayLiteralNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public ArrayLiteralNode nodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		for (final LiteralNode _temp1 : _elements) {
			_aBlock.value_(_temp1);
		}
		return this;
	}

	@Override
	public ArrayLiteralNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ArrayLiteralNode printOn_(final StringBuilder _aStream) {
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
	public ArrayLiteralNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public ArrayLiteralNode sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return ArrayLiteralNode.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	@Override
	public Object[] value() {
		return org.gravel.support.jvm.ArrayExtensions.collect_(_elements, new org.gravel.support.jvm.Block1<Object, LiteralNode>() {

			@Override
			public Object value_(final LiteralNode _each) {
				return _each.value();
			}
		});
	}

	@Override
	public ArrayLiteralNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ArrayLiteralNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public ArrayLiteralNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ArrayLiteralNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
