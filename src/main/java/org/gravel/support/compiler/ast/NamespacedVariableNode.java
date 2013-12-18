package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.Expression.Expression_Factory;
import org.gravel.support.compiler.ast.NodeVisitor;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.SourcePrinter;
import org.gravel.support.compiler.ast.SourcePosition;

public class NamespacedVariableNode extends Expression implements Cloneable {

	public static NamespacedVariableNode_Factory factory = new NamespacedVariableNode_Factory();

	String[] _path;

	public static class NamespacedVariableNode_Factory extends Expression_Factory {

		public NamespacedVariableNode basicNew() {
			NamespacedVariableNode newInstance = new NamespacedVariableNode();
			newInstance.initialize();
			return newInstance;
		}

		public NamespacedVariableNode path_(final String[] _anArray) {
			return ((NamespacedVariableNode) this.basicNew().initializePath_(_anArray));
		}
	}

	static public NamespacedVariableNode _path_(Object receiver, final String[] _anArray) {
		return factory.path_(_anArray);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitNamespacedVariableNode_(this);
	}

	@Override
	public NamespacedVariableNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public NamespacedVariableNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return NamespacedVariableNode.this;
			}
		});
		return this;
	}

	public NamespacedVariableNode copy() {
		try {
			NamespacedVariableNode _temp1 = (NamespacedVariableNode) this.clone();
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
		if (this._path == null) {
			if (!(((NamespacedVariableNode) _anObject)._path == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ArrayExtensions.equals_(this._path, ((NamespacedVariableNode) _anObject)._path)) {
				return false;
			}
		}
		return true;
	}

	public NamespacedVariableNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ java.util.Arrays.hashCode(_path));
	}

	public NamespacedVariableNode initializePath_(final String[] _anArray) {
		_path = _anArray;
		this.initialize();
		return this;
	}

	@Override
	public NamespacedVariableNode innerSourceOn_(final StringBuilder _aStream) {
		boolean _temp1 = true;
		for (final String _elem : _path) {
			if (_temp1) {
				_temp1 = false;
			} else {
				_aStream.append('.');
			}
			_aStream.append(_elem);
		}
		return this;
	}

	@Override
	public NamespacedVariableNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public boolean needsBrackets() {
		return false;
	}

	@Override
	public NamespacedVariableNode nodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		return this;
	}

	public String[] path() {
		return _path;
	}

	@Override
	public int precedence() {
		return 0;
	}

	@Override
	public NamespacedVariableNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public NamespacedVariableNode printOn_(final StringBuilder _aStream) {
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
	public NamespacedVariableNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public NamespacedVariableNode sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return NamespacedVariableNode.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	@Override
	public NamespacedVariableNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public NamespacedVariableNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public NamespacedVariableNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return NamespacedVariableNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
