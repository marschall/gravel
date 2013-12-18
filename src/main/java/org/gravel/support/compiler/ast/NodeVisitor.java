package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.ArrayAccessNode;
import org.gravel.support.compiler.ast.ArrayAtNode;
import org.gravel.support.compiler.ast.ArrayAtPutNode;
import org.gravel.support.compiler.ast.ArrayLiteralNode;
import org.gravel.support.compiler.ast.ArraySizeNode;
import org.gravel.support.compiler.ast.AssignmentNode;
import org.gravel.support.compiler.ast.BinaryMessageNode;
import org.gravel.support.compiler.ast.BinaryMethodNode;
import org.gravel.support.compiler.ast.BlockNode;
import org.gravel.support.compiler.ast.BlockTypeNode;
import org.gravel.support.compiler.ast.BooleanAndNode;
import org.gravel.support.compiler.ast.BooleanBinaryNode;
import org.gravel.support.compiler.ast.BooleanLiteralNode;
import org.gravel.support.compiler.ast.BooleanOrNode;
import org.gravel.support.compiler.ast.BottomTypeNode;
import org.gravel.support.compiler.ast.BoundVariableDeclarationNode;
import org.gravel.support.compiler.ast.ByteArrayLiteralNode;
import org.gravel.support.compiler.ast.CascadeNode;
import org.gravel.support.compiler.ast.CharacterLiteralNode;
import org.gravel.support.compiler.ast.ClassDescriptionNode;
import org.gravel.support.compiler.ast.ClassNode;
import org.gravel.support.compiler.ast.ClassTypeNode;
import org.gravel.support.compiler.ast.CompositeTraitUsageNode;
import org.gravel.support.compiler.ast.CreateHolderNode;
import org.gravel.support.compiler.ast.EmptyTraitUsageNode;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.FieldReadNode;
import org.gravel.support.compiler.ast.FieldWriteNode;
import org.gravel.support.compiler.ast.FixedPointLiteralNode;
import org.gravel.support.compiler.ast.FloatLiteralNode;
import org.gravel.support.compiler.ast.GenericTypeVariableNode;
import org.gravel.support.compiler.ast.GlobalReadNode;
import org.gravel.support.compiler.ast.GlobalWriteNode;
import org.gravel.support.compiler.ast.HolderDeclarationNode;
import org.gravel.support.compiler.ast.IdentityComparisonNode;
import org.gravel.support.compiler.ast.IfTrueIfFalseNode;
import org.gravel.support.compiler.ast.InlineExpressionCollection;
import org.gravel.support.compiler.ast.InstanceCreationNode;
import org.gravel.support.compiler.ast.InstanceTypeNode;
import org.gravel.support.compiler.ast.IntegerLiteralNode;
import org.gravel.support.compiler.ast.IntermediateNode;
import org.gravel.support.compiler.ast.IntermediateStatement;
import org.gravel.support.compiler.ast.IsNilNode;
import org.gravel.support.compiler.ast.KeywordMessageNode;
import org.gravel.support.compiler.ast.KeywordMethodNode;
import org.gravel.support.compiler.ast.LiteralNode;
import org.gravel.support.compiler.ast.LocalReadNode;
import org.gravel.support.compiler.ast.LocalWriteNode;
import org.gravel.support.compiler.ast.MessageNode;
import org.gravel.support.compiler.ast.MetaclassNode;
import org.gravel.support.compiler.ast.MethodNode;
import org.gravel.support.compiler.ast.NamespacedTypeVariableNode;
import org.gravel.support.compiler.ast.NamespacedVariableNode;
import org.gravel.support.compiler.ast.NamespaceNode;
import org.gravel.support.compiler.ast.NilLiteralNode;
import org.gravel.support.compiler.ast.NodeVisitorError;
import org.gravel.support.compiler.ast.NonLocalReturnNode;
import org.gravel.support.compiler.ast.NumberLiteralNode;
import org.gravel.support.compiler.ast.PackageNode;
import org.gravel.support.compiler.ast.PragmaNode;
import org.gravel.support.compiler.ast.ReadHolderNode;
import org.gravel.support.compiler.ast.ReferenceLiteralNode;
import org.gravel.support.compiler.ast.ReturnNode;
import org.gravel.support.compiler.ast.SelfNode;
import org.gravel.support.compiler.ast.SelfTypeNode;
import org.gravel.support.compiler.ast.SequenceNode;
import org.gravel.support.compiler.ast.SharedDeclarationNode;
import org.gravel.support.compiler.ast.SimpleTraitUsageNode;
import org.gravel.support.compiler.ast.StateAccessNode;
import org.gravel.support.compiler.ast.Statement;
import org.gravel.support.compiler.ast.StringLiteralNode;
import org.gravel.support.compiler.ast.SuperNode;
import org.gravel.support.compiler.ast.SymbolLiteralNode;
import org.gravel.support.compiler.ast.SystemDefinitionNode;
import org.gravel.support.compiler.ast.SystemNode;
import org.gravel.support.compiler.ast.ToDoNode;
import org.gravel.support.compiler.ast.TraitUsageNode;
import org.gravel.support.compiler.ast.TypeCast;
import org.gravel.support.compiler.ast.TypeDefNode;
import org.gravel.support.compiler.ast.TypeNode;
import org.gravel.support.compiler.ast.TypeOrNode;
import org.gravel.support.compiler.ast.TypeVariableNode;
import org.gravel.support.compiler.ast.UnaryMessageNode;
import org.gravel.support.compiler.ast.UnaryMethodNode;
import org.gravel.support.compiler.ast.VariableDeclarationNode;
import org.gravel.support.compiler.ast.VariableNode;
import org.gravel.support.compiler.ast.WhileFalseNode;
import org.gravel.support.compiler.ast.WhileNode;
import org.gravel.support.compiler.ast.WhileTrueNode;
import org.gravel.support.compiler.ast.WriteHolderNode;

public class NodeVisitor<X> extends Object implements Cloneable {

	public static NodeVisitor_Factory factory = new NodeVisitor_Factory();

	public static class NodeVisitor_Factory<X> extends org.gravel.support.jvm.SmalltalkFactory {

		public NodeVisitor<X> basicNew() {
			NodeVisitor<X> newInstance = new NodeVisitor<X>();
			newInstance.initialize();
			return newInstance;
		}

		public X visit_(final Node _anObject) {
			return this.basicNew().visit_(_anObject);
		}
	}

	public NodeVisitor<X> copy() {
		try {
			NodeVisitor<X> _temp1 = (NodeVisitor<X>) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public NodeVisitor_Factory<X> factory() {
		return factory;
	}

	public NodeVisitor initialize() {
		return this;
	}

	public NodeVisitor<X> postCopy() {
		return this;
	}

	public X visitArrayAccessNode_(final ArrayAccessNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitArrayAtNode_(final ArrayAtNode _anObject) {
		return this.visitArrayAccessNode_(_anObject);
	}

	public X visitArrayAtPutNode_(final ArrayAtPutNode _anObject) {
		return this.visitArrayAccessNode_(_anObject);
	}

	public X visitArrayLiteralNode_(final ArrayLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitArraySizeNode_(final ArraySizeNode _anObject) {
		return this.visitArrayAccessNode_(_anObject);
	}

	public X visitAssignmentNode_(final AssignmentNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitBinaryMessageNode_(final BinaryMessageNode _anObject) {
		return this.visitMessageNode_(_anObject);
	}

	public X visitBinaryMethodNode_(final BinaryMethodNode _anObject) {
		return this.visitMethodNode_(_anObject);
	}

	public X visitBlockNode_(final BlockNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitBlockTypeNode_(final BlockTypeNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitBooleanAndNode_(final BooleanAndNode _anObject) {
		return this.visitBooleanBinaryNode_(_anObject);
	}

	public X visitBooleanBinaryNode_(final BooleanBinaryNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitBooleanLiteralNode_(final BooleanLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitBooleanOrNode_(final BooleanOrNode _anObject) {
		return this.visitBooleanBinaryNode_(_anObject);
	}

	public X visitBottomTypeNode_(final BottomTypeNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitBoundVariableDeclarationNode_(final BoundVariableDeclarationNode _anObject) {
		return this.visitVariableDeclarationNode_(_anObject);
	}

	public X visitByteArrayLiteralNode_(final ByteArrayLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitCascadeNode_(final CascadeNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitCharacterLiteralNode_(final CharacterLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitClassDescriptionNode_(final ClassDescriptionNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitClassNode_(final ClassNode _anObject) {
		return this.visitClassDescriptionNode_(_anObject);
	}

	public X visitClassTypeNode_(final ClassTypeNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitCompositeTraitUsageNode_(final CompositeTraitUsageNode _anObject) {
		return this.visitTraitUsageNode_(_anObject);
	}

	public X visitCreateHolderNode_(final CreateHolderNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitEmptyTraitUsageNode_(final EmptyTraitUsageNode _anObject) {
		return this.visitTraitUsageNode_(_anObject);
	}

	public X visitExpression_(final Expression _anObject) {
		return this.visitStatement_(_anObject);
	}

	public X visitFieldReadNode_(final FieldReadNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitFieldWriteNode_(final FieldWriteNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitFixedPointLiteralNode_(final FixedPointLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitFloatLiteralNode_(final FloatLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitGenericTypeVariableNode_(final GenericTypeVariableNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitGlobalReadNode_(final GlobalReadNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitGlobalWriteNode_(final GlobalWriteNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitHolderDeclarationNode_(final HolderDeclarationNode _anObject) {
		return this.visitVariableDeclarationNode_(_anObject);
	}

	public X visitIdentityComparisonNode_(final IdentityComparisonNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitIfTrueIfFalseNode_(final IfTrueIfFalseNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitInlineExpressionCollection_(final InlineExpressionCollection _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitInstanceCreationNode_(final InstanceCreationNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitInstanceTypeNode_(final InstanceTypeNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitIntegerLiteralNode_(final IntegerLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitIntermediateNode_(final IntermediateNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitIntermediateStatement_(final IntermediateStatement _anObject) {
		return this.visitStatement_(_anObject);
	}

	public X visitIsNilNode_(final IsNilNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitKeywordMessageNode_(final KeywordMessageNode _anObject) {
		return this.visitMessageNode_(_anObject);
	}

	public X visitKeywordMethodNode_(final KeywordMethodNode _anObject) {
		return this.visitMethodNode_(_anObject);
	}

	public X visitLiteralNode_(final LiteralNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitLocalReadNode_(final LocalReadNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitLocalWriteNode_(final LocalWriteNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitMessageNode_(final MessageNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitMetaclassNode_(final MetaclassNode _anObject) {
		return this.visitClassDescriptionNode_(_anObject);
	}

	public X visitMethodNode_(final MethodNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitNamespacedTypeVariableNode_(final NamespacedTypeVariableNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitNamespacedVariableNode_(final NamespacedVariableNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitNamespaceNode_(final NamespaceNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitNilLiteralNode_(final NilLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitNode_(final Node _anObject) {
		throw NodeVisitorError.factory.basicNew();
	}

	public X visitNonLocalReturnNode_(final NonLocalReturnNode _anObject) {
		return this.visitIntermediateStatement_(_anObject);
	}

	public X visitNumberLiteralNode_(final NumberLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitPackageNode_(final PackageNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitPragmaNode_(final PragmaNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitReadHolderNode_(final ReadHolderNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitReferenceLiteralNode_(final ReferenceLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitReturnNode_(final ReturnNode _anObject) {
		return this.visitStatement_(_anObject);
	}

	public X visitSelfNode_(final SelfNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitSelfTypeNode_(final SelfTypeNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitSequenceNode_(final SequenceNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitSharedDeclarationNode_(final SharedDeclarationNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitSimpleTraitUsageNode_(final SimpleTraitUsageNode _anObject) {
		return this.visitTraitUsageNode_(_anObject);
	}

	public X visitStateAccessNode_(final StateAccessNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitStatement_(final Statement _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitStringLiteralNode_(final StringLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitSuperNode_(final SuperNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visitSymbolLiteralNode_(final SymbolLiteralNode _anObject) {
		return this.visitLiteralNode_(_anObject);
	}

	public X visitSystemDefinitionNode_(final SystemDefinitionNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitSystemNode_(final SystemNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitToDoNode_(final ToDoNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitTraitUsageNode_(final TraitUsageNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitTypeCast_(final TypeCast _aTypeCast) {
		return this.visitExpression_(_aTypeCast);
	}

	public X visitTypeDefNode_(final TypeDefNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitTypeNode_(final TypeNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitTypeOrNode_(final TypeOrNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitTypeVariableNode_(final TypeVariableNode _anObject) {
		return this.visitTypeNode_(_anObject);
	}

	public X visitUnaryMessageNode_(final UnaryMessageNode _anObject) {
		return this.visitMessageNode_(_anObject);
	}

	public X visitUnaryMethodNode_(final UnaryMethodNode _anObject) {
		return this.visitMethodNode_(_anObject);
	}

	public X visitVariableDeclarationNode_(final VariableDeclarationNode _anObject) {
		return this.visitNode_(_anObject);
	}

	public X visitVariableNode_(final VariableNode _anObject) {
		return this.visitExpression_(_anObject);
	}

	public X visitWhileFalseNode_(final WhileFalseNode _aNode) {
		return this.visitWhileNode_(_aNode);
	}

	public X visitWhileNode_(final WhileNode _anObject) {
		return this.visitIntermediateNode_(_anObject);
	}

	public X visitWhileTrueNode_(final WhileTrueNode _aNode) {
		return this.visitWhileNode_(_aNode);
	}

	public X visitWriteHolderNode_(final WriteHolderNode _anObject) {
		return this.visitStateAccessNode_(_anObject);
	}

	public X visit_(final Node _anObject) {
		return _anObject.accept_(this);
	}
}
