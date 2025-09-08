package com.example.report;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade() {
        this.jsonWriter = new JsonWriter();
        this.zipper = new Zipper();
        this.auditLog = new AuditLog();
    }

    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        // Validate inputs
        Objects.requireNonNull(data, "data cannot be null");
        Objects.requireNonNull(outDir, "outDir cannot be null");
        Objects.requireNonNull(baseName, "baseName cannot be null");

        try {
            Path jsonFile = jsonWriter.write(data, outDir, baseName);

            Path zipFile = outDir.resolve(baseName + ".zip");
            Path createdZip = zipper.zip(jsonFile, zipFile);
            auditLog.log("exported " + createdZip);

            return createdZip;
        } catch (UncheckedIOException e) {
            throw e;
        }
    }
}
