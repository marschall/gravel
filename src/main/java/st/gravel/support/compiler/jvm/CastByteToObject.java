package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.CastTo;
import st.gravel.support.compiler.jvm.CastTo.CastTo_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMDynamicObjectType;

public class CastByteToObject extends CastTo implements Cloneable {

	public static CastByteToObject_Factory factory = new CastByteToObject_Factory();

	public static class CastByteToObject_Factory extends CastTo_Factory {

		public CastByteToObject basicNew() {
			CastByteToObject newInstance = new CastByteToObject();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitCastByteToObject_(this);
	}

	public CastByteToObject copy() {
		try {
			CastByteToObject _temp1 = (CastByteToObject) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.pop().isByteType());
		_aJVMStack.push_(this.type());
		return this;
	}

	public CastByteToObject_Factory factory() {
		return factory;
	}

	@Override
	public CastByteToObject printOn_(final StringBuilder _aStream) {
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
	public CastByteToObject sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMDynamicObjectType.factory.basicNew();
	}

	@Override
	public CastByteToObject withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return CastByteToObject.this;
		}
		throw new RuntimeException("niy");
	}
}
