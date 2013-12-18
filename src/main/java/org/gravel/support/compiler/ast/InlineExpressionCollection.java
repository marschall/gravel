package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.IntermediateNode;
import org.gravel.support.compiler.ast.IntermediateNode.IntermediateNode_Factory;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.NodeVisitor;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.SourcePrinter;
import org.gravel.support.compiler.ast.SourcePosition;

public class InlineExpressionCollection extends IntermediateNode implements Cloneable {

	public static InlineExpressionCollection_Factory factory = new InlineExpressionCollection_Factory();

	Expression[] _expressions;

	public static class InlineExpressionCollection_Factory extends IntermediateNode_Factory {

		public InlineExpressionCollection basicNew() {
			InlineExpressionCollection newInstance = new InlineExpressionCollection();
			newInstance.initialize();
			return newInstance;
		}

		public InlineExpressionCollection expressions_(final Expression[] _anArray) {
			return ((InlineExpressionCollection) this.basicNew().initializeExpressions_(_anArray));
		}
	}

	static public InlineExpressionCollection _expressions_(Object receiver, final Expression[] _anArray) {
		return factory.expressions_(_anArray);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitInlineExpressionCollection_(this);
	}

	@Override
	public InlineExpressionCollection allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public InlineExpressionCollection allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return InlineExpressionCollection.this;
			}
		});
		return this;
	}

	public InlineExpressionCollection copy() {
		try {
			InlineExpressionCollection _temp1 = (InlineExpressionCollection) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public Expression[] expressions() {
		return _expressions;
	}

	public InlineExpressionCollection_Factory factory() {
		return factory;
	}

	public InlineExpressionCollection initializeExpressions_(final Expression[] _anArray) {
		_expressions = _anArray;
		this.initialize();
		return this;
	}

	@Override
	public InlineExpressionCollection innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{");
		boolean _temp1 = true;
		for (final Expression _each : _expressions) {
			if (_temp1) {
				_temp1 = false;
			} else {
				_aStream.append(". ");
			}
			_each.innerSourceOn_(_aStream);
		}
		_aStream.append("]}");
		return this;
	}

	@Override
	public InlineExpressionCollection localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public InlineExpressionCollection nodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		for (final Expression _temp1 : _expressions) {
			_aBlock.value_(_temp1);
		}
		return this;
	}

	@Override
	public InlineExpressionCollection prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public InlineExpressionCollection printOn_(final StringBuilder _aStream) {
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
	public InlineExpressionCollection pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public InlineExpressionCollection sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public Expression unoptimized() {
		return null;
	}

	@Override
	public InlineExpressionCollection withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public InlineExpressionCollection withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public InlineExpressionCollection withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return InlineExpressionCollection.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
