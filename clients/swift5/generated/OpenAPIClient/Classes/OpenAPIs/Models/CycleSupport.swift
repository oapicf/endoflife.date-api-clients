//
// CycleSupport.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Whether this release cycle has active support */
public struct CycleSupport: Codable, JSONEncodable, Hashable {


    public enum CodingKeys: CodingKey, CaseIterable {
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
    }
}
