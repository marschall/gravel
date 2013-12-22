package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMDynamicObjectType;

public class DynamicSend extends JVMInstruction implements Cloneable {

	public static DynamicSend_Factory factory = new DynamicSend_Factory();

	JVMType[] _argumentTypes;

	String _functionName;

	int _numArgs;

	JVMType _receiverType;

	public static class DynamicSend_Factory extends JVMInstruction_Factory {

		public DynamicSend basicNew() {
			DynamicSend newInstance = new DynamicSend();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitDynamicSend_(this);
	}

	public DynamicSend copy() {
		try {
			DynamicSend _temp1 = (DynamicSend) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		final JVMType _aReceiverType;
		final JVMType[] _anArray;
		_anArray = new st.gravel.core.Interval(1, _numArgs).collect_(new st.gravel.support.jvm.Block1<JVMType, Integer>() {

			@Override
			public JVMType value_(final Integer _i) {
				final JVMType _elemType;
				_elemType = _aJVMStack.pop();
				st.gravel.support.jvm.ObjectExtensions.assert_(DynamicSend.this, _elemType.isObjectType());
				return (JVMType) _elemType;
			}
		});
		_aReceiverType = _aJVMStack.pop();
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _aReceiverType.isObjectType());
		_aJVMStack.push_(this.type());
		return this.withReceiverType_argumentTypes_(_aReceiverType, _anArray);
	}

	public DynamicSend_Factory factory() {
		return factory;
	}

	public String functionName() {
		return _functionName;
	}

	public int numArgs() {
		return _numArgs;
	}

	@Override
	public DynamicSend printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	public DynamicSend pvtSetArgumentTypes_(final JVMType[] _anArray) {
		_argumentTypes = _anArray;
		return this;
	}

	public DynamicSend pvtSetReceiverType_(final JVMType _aJVMObjectType) {
		_receiverType = _aJVMObjectType;
		return this;
	}

	@Override
	public DynamicSend sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_functionName);
		return this;
	}

	@Override
	public JVMType type() {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public DynamicSend withReceiverType_argumentTypes_(final JVMType _aJVMObjectType, final JVMType[] _anArray) {
		DynamicSend _temp1 = this.copy();
		_temp1.pvtSetReceiverType_(_aJVMObjectType);
		return _temp1.pvtSetArgumentTypes_(_anArray);
	}

	@Override
	public DynamicSend withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return DynamicSend.this;
		}
		throw new RuntimeException("niy");
	}
}
