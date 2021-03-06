package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.NumberLiteralNode;
import st.gravel.support.compiler.ast.NumberLiteralNode.NumberLiteralNode_Factory;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

abstract public class LimitedPrecisionRealLiteralNode extends NumberLiteralNode implements Cloneable {

	public static LimitedPrecisionRealLiteralNode_Factory factory = new LimitedPrecisionRealLiteralNode_Factory();

	String _valueString;

	public static class LimitedPrecisionRealLiteralNode_Factory extends NumberLiteralNode_Factory {

		public LimitedPrecisionRealLiteralNode basicNew() {
			throw new RuntimeException("LimitedPrecisionRealLiteralNode is an abstract class");
		}

		public Character exponentCharacter() {
			throw new RuntimeException("subclassResponsibility");
		}

		public boolean exponentCharacterIsMandatory() {
			throw new RuntimeException("subclassResponsibility");
		}

		public LimitedPrecisionRealLiteralNode integer_fractionString_exponent_(final java.math.BigInteger _anInteger, final String _fractionString, final java.math.BigInteger _exp) {
			final StringBuilder _wstr;
			_wstr = st.gravel.support.jvm.WriteStreamFactory.on_(new String());
			_wstr.append(_anInteger.toString());
			if (_fractionString != null) {
				_wstr.append('.');
				_wstr.append(_fractionString);
			}
			if (!((_exp == null) && (!this.exponentCharacterIsMandatory()))) {
				_wstr.append(LimitedPrecisionRealLiteralNode_Factory.this.exponentCharacter());
				if (!((_exp == null) || st.gravel.support.jvm.LargeIntegerExtensions.isZero(_exp))) {
					_wstr.append(_exp.toString());
				}
			}
			return ((LimitedPrecisionRealLiteralNode) this.valueString_(_wstr.toString()));
		}

		public LimitedPrecisionRealLiteralNode valueString_(final String _aString) {
			return ((LimitedPrecisionRealLiteralNode) this.basicNew().initializeValueString_(_aString));
		}
	}

	static public LimitedPrecisionRealLiteralNode _integer_fractionString_exponent_(Object receiver, final java.math.BigInteger _anInteger, final String _fractionString, final java.math.BigInteger _exp) {
		return factory.integer_fractionString_exponent_(_anInteger, _fractionString, _exp);
	}

	static public LimitedPrecisionRealLiteralNode _valueString_(Object receiver, final String _aString) {
		return factory.valueString_(_aString);
	}

	@Override
	public LimitedPrecisionRealLiteralNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return LimitedPrecisionRealLiteralNode.this;
			}
		});
		return this;
	}

	public LimitedPrecisionRealLiteralNode copy() {
		try {
			LimitedPrecisionRealLiteralNode _temp1 = (LimitedPrecisionRealLiteralNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public LimitedPrecisionRealLiteralNode_Factory factory() {
		return factory;
	}

	public LimitedPrecisionRealLiteralNode initializeValueString_(final String _aString) {
		_valueString = _aString;
		this.initialize();
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append(_valueString);
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return LimitedPrecisionRealLiteralNode.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	public String valueString() {
		return _valueString;
	}

	@Override
	public LimitedPrecisionRealLiteralNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public LimitedPrecisionRealLiteralNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return LimitedPrecisionRealLiteralNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
