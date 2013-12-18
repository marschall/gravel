package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMNonPrimitiveType;
import org.gravel.support.compiler.jvm.JVMNonPrimitiveType.JVMNonPrimitiveType_Factory;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMNodeVisitor;
import org.gravel.support.compiler.jvm.CastObjectToArray;
import org.gravel.support.compiler.jvm.CastTo;

public class JVMArrayType extends JVMNonPrimitiveType implements Cloneable {

	public static JVMArrayType_Factory factory = new JVMArrayType_Factory();

	JVMType _elementType;

	public static class JVMArrayType_Factory extends JVMNonPrimitiveType_Factory {

		public JVMArrayType basicNew() {
			JVMArrayType newInstance = new JVMArrayType();
			newInstance.initialize();
			return newInstance;
		}

		public JVMArrayType elementType_(final JVMType _aJVMObjectType) {
			return this.basicNew().initializeElementType_(_aJVMObjectType);
		}
	}

	static public JVMArrayType _elementType_(Object receiver, final JVMType _aJVMObjectType) {
		return factory.elementType_(_aJVMObjectType);
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMArrayType_(this);
	}

	@Override
	public String className() {
		return this.descriptorString();
	}

	@Override
	public JVMType commonSuperTypeWith_(final JVMType _aJVMType) {
		return _aJVMType.commonSuperTypeWithArray_(this);
	}

	public JVMArrayType copy() {
		try {
			JVMArrayType _temp1 = (JVMArrayType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMArrayType descriptorOn_(final StringBuilder _aStream) {
		_aStream.append('[');
		_elementType.descriptorOn_(_aStream);
		return this;
	}

	@Override
	public String dottedClassName() {
		return this.descriptorString();
	}

	public JVMType elementType() {
		return _elementType;
	}

	public JVMArrayType_Factory factory() {
		return factory;
	}

	public JVMArrayType initializeElementType_(final JVMType _aJVMObjectType) {
		_elementType = _aJVMObjectType;
		this.initialize();
		return this;
	}

	@Override
	public boolean isArrayType() {
		return true;
	}

	@Override
	public CastObjectToArray newCastInstructionFromDynamicObject() {
		return CastObjectToArray.factory.elementType_(_elementType);
	}

	@Override
	public CastTo newCastInstructionTo_(final JVMType _aJVMType) {
		return _aJVMType.newCastInstructionFromArray_(this);
	}

	@Override
	public JVMArrayType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMArrayType sourceOn_(final StringBuilder _aStream) {
		_aStream.append('[');
		_elementType.sourceOn_(_aStream);
		return this;
	}
}
