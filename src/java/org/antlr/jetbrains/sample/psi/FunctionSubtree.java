package org.antlr.jetbrains.sample.psi;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class FunctionSubtree extends IdentifierDefSubtree {
	public FunctionSubtree(@NotNull ASTNode node) {
		super(node);
	}
}
