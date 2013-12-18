package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.CastTo;
import org.gravel.support.compiler.jvm.CastTo.CastTo_Factory;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMInstructionVisitor;
import org.gravel.support.compiler.jvm.JVMStack;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.JVMArrayType;

public class CastObjectToArray extends CastTo implements Cloneable {

	public static CastObjectToArray_Factory factory = new CastObjectToArray_Factory();

	JVMType _elementType;

	public static class CastObjectToArray_Factory extends CastTo_Factory {

		public CastObjectToArray basicNew() {
			CastObjectToArray newInstance = new CastObjectToArray();
			newInstance.initialize();
			return newInstance;
		}

		public CastObjectToArray elementType_(final JVMType _aJVMDynamicObjectType) {
			return this.basicNew().initializeElementType_(_aJVMDynamicObjectType);
		}
	}

	static public CastObjectToArray _elementType_(Object receiver, final JVMType _aJVMDynamicObjectType) {
		return factory.elementType_(_aJVMDynamicObjectType);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitCastObjectToArray_(this);
	}

	public CastObjectToArray copy() {
		try {
			CastObjectToArray _temp1 = (CastObjectToArray) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.pop().isObjectType());
		_aJVMStack.push_(this.type());
		return this;
	}

	public JVMType elementType() {
		return _elementType;
	}

	public CastObjectToArray_Factory factory() {
		return factory;
	}

	public CastObjectToArray initializeElementType_(final JVMType _aJVMDynamicObjectType) {
		_elementType = _aJVMDynamicObjectType;
		this.initialize();
		return this;
	}

	@Override
	public CastObjectToArray printOn_(final StringBuilder _aStream) {
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
	public CastObjectToArray sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMArrayType.factory.elementType_(_elementType);
	}

	@Override
	public CastObjectToArray withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return CastObjectToArray.this;
		}
		throw new RuntimeException("niy");
	}
}
